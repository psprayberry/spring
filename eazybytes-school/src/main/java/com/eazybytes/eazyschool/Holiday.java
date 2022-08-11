// *****************************************************************************
//   File:  Holiday.java
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
//   Type:  Holiday
/**
 *   A school holiday.
 */
// =============================================================================
@Data
public final
class Holiday
{ // begin holidays
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   //   Declare protected features
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   /*
    *   Declare enumerations
    */
   protected
   enum Type
   { // begin holiday types
      FEDERAL, 
      FESTIVAL
   } // end holiday types
   /*
    *   Define constructors
    */
   // // --------------------------------------------------------------------------
   // //   Constructor:  Holiday
   // /**
   //  *   Constructs a default instance for the given date information.
   //  */
   // // --------------------------------------------------------------------------
   // protected
   // Holiday(final String day,
   //         final String reason,
   //         final Type   type)
   // { // begin constructing a holiday instance
   //    super();
   //    //
   //    this.day    = day;
   //    this.reason = reason;
   //    this.type   = type;
   // } // end constructing a holiday instance
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   //   Declare private features
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   /*
    *   Declare fields
    */
   private final String day;
   private final String reason;
   private final Type   type;
} // end holidays