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
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
//
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
@Slf4j
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
   //  *   @param name      a {@link String} containing the sender's name
   //  *   @param mobileNum a {@link String} containing the sender's mobile phone 
   //  *                    number
   //  *   @param email     a {@link String} containing the sender's email address
   //  *   @param subject   a {@link String} containing the subject of the message
   //  *   @param message   a {@link String} containing the body of the message
    */
   /*
    *   TODO 2022-08-09 pcs Change the argument type to a message type
   //  *   TODO 2022-08-09 pcs Change the sender's name to a first rate type
   //  *   TODO 2022-08-09 pcs Change the sender's phone number to a first rate 
   //  *                       type
   //  *   TODO 2022-08-09 pcs Change the sender's email address to a first rate 
   //  *                       type
   //  *   TODO 2022-08-09 pcs Change the subject to a first rate type
   //  *   TODO 2022-08-09 pcs Change the message to a type that supports more 
   //  *                       than just a string
   //  *
   //  *   XXX 2022-08-09 pcs Is it possible to return a JSON object?
    */
   // --------------------------------------------------------------------------
   @PostMapping(value = "/saveMsg")
   protected final 
   ModelAndView
   saveAMessage(Contact theMessage)
   // saveAMessage(@RequestParam final String name, 
   //              @RequestParam final String mobileNum, 
   //              @RequestParam final String email, 
   //              @RequestParam final String subject, 
   //              @RequestParam final String message)
   { // begin displaying the contact page
      this.messageService.saveTheMessageDetails(theMessage);
      // log.info("Name:          " + name);
      // log.info("Mobile number: " + mobileNum);
      // log.info("Email address: " + email);
      // log.info("Subject:       " + subject);
      // log.info("Message:       " + message);
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