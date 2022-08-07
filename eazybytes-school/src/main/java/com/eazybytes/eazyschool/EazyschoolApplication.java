// *****************************************************************************
//   File:  EazyschoolApplication.java
// *****************************************************************************
/*
 *   Declare the package
 */
package com.eazybytes.eazyschool;
/*
 *   Import external features
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
/*
 *   Define types
 */
// =============================================================================
//   Type:  EazyschoolApplication
/**
 *   Runs the EazyBytes school web application via Spring Boot.
 * 
 *   @see SpringBootApplication
 */
/*
 *   XXX 2022-08-07 pcs Should a new type be created for the @Configuration 
 *                      annotation?
 *   XXX 2022-08-07 pcs Should a new type be created for the @Controller 
 *                      annotation?
 */
// =============================================================================
@Configuration
@Controller
@SpringBootApplication
public
class EazyschoolApplication implements WebMvcConfigurer
{ // begin the Eazy school application
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   //   Define public features
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   /*
    *   Define methods
    */
   // --------------------------------------------------------------------------
   //   Method:  EazyschoolApplication.main
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
   // --------------------------------------------------------------------------
   //   Method:  EazyschoolApplication.main
   /**
    *   Runs the application.
    *
    *   @param args an array of {@link String}s containing the command line 
    *               arguments
    */
   // --------------------------------------------------------------------------
   public static 
   void 
   main(final String[] args)
   { // begin running the application
      SpringApplication.run(EazyschoolApplication.class, args);
   } // end running the application
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   //   Declare protected features
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   /*
    *   Define constructors
    */
   // --------------------------------------------------------------------------
   //   Constructor:  EazyschoolApplication
   /**
    *   Constructs a default instance.
    */
   // --------------------------------------------------------------------------
   protected
   EazyschoolApplication()
   { // begin constructing a EazyschoolApplication instance
      super();
   } // end constructing a EazyschoolApplication instance
   /*
    *   Define methods
    */
   // --------------------------------------------------------------------------
   //   Constructor:  EazyschoolApplication.hello
   /**
    *   Displays a welcome message in a browser.
    */
   /* */
   // --------------------------------------------------------------------------
   @RequestMapping(value = {"", "/", "home"})
   protected final 
   String 
   displayTheHomePage()
   { // begin displaying the home page
      return ("home.html");
   } // end displaying the home page
} // end the Eazy school application