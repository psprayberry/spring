// *****************************************************************************
//   File:  Contact.java
// *****************************************************************************
/*
 *   Declare the package
 */
package com.eazybytes.eazyschool;
/*
 *   Import external features
 */
import lombok.Data;
/*
 *   Define types
 */
// =============================================================================
//   Type:  Contact
/**
 *   A school contact.
 */
// =============================================================================
@Data
public final
class Contact
{ // begin contacts
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   //   Declare protected features
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   /*
    *   Define constructors
    */
   // --------------------------------------------------------------------------
   //   Constructor:  Contact
   /**
    *   Constructs a default instance.
    */
   // --------------------------------------------------------------------------
   protected
   Contact()
   { // begin constructing a Contact instance
      super();
   } // end constructing a Contact instance
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   //   Declare private features
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   /*
    *   Declare fields
    */
   private String email;
   private String message;
   private String mobileNum;
   private String name;
   private String subject;
} // end contacts