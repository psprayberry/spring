// *****************************************************************************
//   File:  ContactService.java
// *****************************************************************************
/*
 *   Declare the package
 */
package com.eazybytes.eazyschool;
/*
 *   Import external features
 */
import lombok.extern.slf4j.Slf4j;
//
import org.springframework.stereotype.Service;
/*
 *   Define types
 */
// =============================================================================
//   Type:  ContactService
/**
 *   A Spring service for managing contacts.
 * 
 *   @see Service
 */
// =============================================================================
@Service
@Slf4j
public final
class ContactService
{ // begin controlling contacts
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   //   Declare protected features
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   /*
    *   Define constructors
    */
   // --------------------------------------------------------------------------
   //   Constructor:  ContactService
   /**
    *   Constructs a default instance.
    */
   // --------------------------------------------------------------------------
   protected
   ContactService(/*final ContactService withTheMessageService*/)
   { // begin constructing a ContactService instance
      super();
   } // end constructing a ContactService instance
   /*
    *   Define methods
    */
   // --------------------------------------------------------------------------
   //   Constructor:  ContactService.saveTheMessageDetails
   /**
    *   Saves a message.
    *
    *   @param theMessage the message to save, as a {@link Contact}
    *
    *   @return <code>true</code> if and only if the message was saved 
    *           successfully
    */
   /*
    *   TODO 2022-08-09 pcs Change the argument type to a message type
    */
   // --------------------------------------------------------------------------
   protected final 
   boolean
   saveTheMessageDetails(final Contact theMessage)
   { // begin saving the message
      boolean theMessageWasSaved = true;
      //
      log.info(theMessage.toString());
      //
      return (theMessageWasSaved);
   } // end saving the message
//    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//    //   Declare private features
//    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//    /*
//     *   Declare fields
//     */
//    private final ContactService messageService;
} // end controlling contacts