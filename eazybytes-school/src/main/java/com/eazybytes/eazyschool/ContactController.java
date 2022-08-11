// *****************************************************************************
//   File:  ContactController.java
// *****************************************************************************
/*
 *   Declare the package
 */
package com.eazybytes.eazyschool;
/*
 *   Import external features
 */
import org.springframework.beans.factory.annotation.Autowired;
//
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
/*
 *   Define types
 */
// =============================================================================
//   Type:  ContactController
/**
 *   A Spring controller for managing contacts.
 */
// =============================================================================
@Controller
public final
class ContactController
{ // begin controlling contacts
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   //   Declare protected features
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   /*
    *   Define constructors
    */
   // --------------------------------------------------------------------------
   //   Constructor:  ContactController
   /**
    *   Constructs a default instance with the given message service.
    *
    *   @param withTheMessageService a message service as a 
    *                                {@link ContactService}
    */
   // --------------------------------------------------------------------------
   @Autowired
   protected
   ContactController(final ContactService withTheMessageService)
   { // begin constructing a ContactController instance
      super();
      //
      this.messageService = withTheMessageService;
   } // end constructing a ContactController instance
   /*
    *   Define methods
    */
   // --------------------------------------------------------------------------
   //   Constructor:  ContactController.displayTheContactPage
   /**
    *   Displays the contact page.
    */
   // --------------------------------------------------------------------------
   @GetMapping(value = "/contact")
   protected final 
   String
   displayTheContactPage()
   { // begin displaying the contact page
      return ("contact.html");
   } // end displaying the contact page
   // --------------------------------------------------------------------------
   //   Constructor:  ContactController.saveAMessage
   /**
    *   Saves a message.
    *
    *   @param theMessage the message to save, as a {@link Contact}
    */
   // --------------------------------------------------------------------------
   @PostMapping(value = "/saveMsg")
   protected final 
   ModelAndView
   saveAMessage(Contact theMessage)
   { // begin displaying the contact page
      this.messageService.saveTheMessageDetails(theMessage);
      //
      return (new ModelAndView("redirect:/contact"));
   } // end displaying the contact page
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   //   Declare private features
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   /*
    *   Declare fields
    */
   private final ContactService messageService;
} // end controlling contacts