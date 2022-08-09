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
// =============================================================================
@SpringBootApplication
public
class EazyschoolApplication
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
} // end the Eazy school application