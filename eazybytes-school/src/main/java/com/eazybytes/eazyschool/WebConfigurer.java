// *****************************************************************************
//   File:  WebConfigurer.java
// *****************************************************************************
/*
 *   Declare the package
 */
package com.eazybytes.eazyschool;
/*
 *   Import external features
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/*
 *   Define types
 */
// =============================================================================
//   Type:  WebConfigurer
/**
 *   Configures static web pages.
 */
// =============================================================================
@Configuration
public 
class WebConfigurer implements WebMvcConfigurer
{ // begin configuring static web pages
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   //   Define public features
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   /*
    *   Define methods
    */
   // --------------------------------------------------------------------------
   //   Method:  WebConfigurer.addViewControllers
   /**
    *   Wire in pages without specific controllers.
    *
    *   @param to the {@link ViewControllerRegistry} to which to add pages
    */
   // --------------------------------------------------------------------------
   @Override
   public final 
   void 
   addViewControllers(final ViewControllerRegistry to)
   { // begin adding view controllers
      to.addViewController("/about")  .setViewName("about");
      to.addViewController("/courses").setViewName("courses");
   } // end adding view controllers
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   //   Declare protected features
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   /*
    *   Define constructors
    */
   // --------------------------------------------------------------------------
   //   Constructor:  WebConfigurer
   /**
    *   Constructs a default instance.
    */
   // --------------------------------------------------------------------------
   protected
   WebConfigurer()
   { // begin constructing a WebConfigurer instance
      super();
   } // end constructing a WebConfigurer instance
} // end configuring static web pages