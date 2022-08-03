// *****************************************************************************
//   File:  SpringHelloWorld.java
// *****************************************************************************
/*
 *   Declare the package
 */
package pcs;
/*
 *   Import features
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*
 *   Define types
 */
// =============================================================================
//   Type:  SpringHelloWorld
/*
 *   Defines the main part of a Hello World application that uses the Spring 
 *   framework.  This was an attempt to see if I could build a Spring Boot 
 *   application from scratch.
 * 
 *   @see RestController
 *   @see SpringBootApplication
 */
// =============================================================================
@RestController
@SpringBootApplication
public 
class SpringHelloWorld
{ // begin SpringHelloWorld
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   //   Declare public features
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   /*
    *   Define methods
    */
   // --------------------------------------------------------------------------
   //   Method:  SpringHelloWorld.main
   /*
    *   Runs the application.
    *
    *   @param args an array of {@link String}s containing the command line 
                    arguments
    */
   // --------------------------------------------------------------------------
   public static final
   void
   main(final String[] args)
   { // begin running a SpringHelloWorld instance
      SpringApplication.run(SpringHelloWorld.class, args);
   } // end running a SpringHelloWorld instance
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   //   Declare protected features
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   /*
    *   Define constructors
    */
   // --------------------------------------------------------------------------
   //   Constructor:  SpringHelloWorld
   /*
    *   Constructs a default instance.
    */
   // --------------------------------------------------------------------------
   protected
   SpringHelloWorld()
   { // begin constructing a SpringHelloWorld instance
      super();
   } // end constructing a SpringHelloWorld instance
   /*
    *   Define methods
    */
   @GetMapping("/hello")
   protected final 
   String 
   hello(@RequestParam(value = "name", defaultValue = "World") String name)
   { // begin greeting the user
      return String.format("Hello, %s!", name);
   } // end greeting the user
} // end SpringHelloWorld