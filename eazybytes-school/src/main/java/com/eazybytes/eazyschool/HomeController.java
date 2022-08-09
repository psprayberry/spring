// *****************************************************************************
//   File:  HomeController.java
// *****************************************************************************
/*
 *   Declare the package
 */
package com.eazybytes.eazyschool;
/*
 *   Import external features
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/*
 *   Define types
 */
// =============================================================================
//   Type:  HomeController
/**
 *   A Spring controller for the home page.
 */
// =============================================================================
@Controller
public
class HomeController
{ // begin controlling the home page
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   //   Declare protected features
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   /*
    *   Define constructors
    */
   // --------------------------------------------------------------------------
   //   Constructor:  HomeController
   /**
    *   Constructs a default instance.
    */
   // --------------------------------------------------------------------------
   protected
   HomeController()
   { // begin constructing a HomeController instance
      super();
   } // end constructing a HomeController instance
   /*
    *   Define methods
    */
   // --------------------------------------------------------------------------
   //   Constructor:  HomeController.displayTheHomePage
   /**
    *   Displays the home page.
    */
   // --------------------------------------------------------------------------
   @GetMapping(value = {"", "/", "home"})
   protected final 
   String 
   displayTheHomePage()
   { // begin displaying the home page
      return ("home.html");
   } // end displaying the home page
} // end controlling the home page