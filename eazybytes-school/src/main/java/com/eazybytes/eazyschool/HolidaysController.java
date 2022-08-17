// *****************************************************************************
//   File:  HolidaysController.java
// *****************************************************************************
/*
 *   Declare the package
 */
package com.eazybytes.eazyschool;
/*
 *   Import external features
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
/*
 *   Define types
 */
// =============================================================================
//   Type:  HolidaysController
/**
 *   A Spring controller for managing holidays.
 */
// =============================================================================
@Controller
public final
class HolidaysController
{ // begin controlling holidays
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   //   Declare protected features
   // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   /*
    *   Define constructors
    */
   // --------------------------------------------------------------------------
   //   Constructor:  HolidaysController
   /**
    *   Constructs a default instance.
    */
   // --------------------------------------------------------------------------
   protected
   HolidaysController(final ContactService withTheMessageService)
   { // begin constructing a HolidaysController instance
      super();
   } // end constructing a HolidaysController instance
   /*
    *   Define methods
    */
   // --------------------------------------------------------------------------
   //   Constructor:  HolidaysController.displayTheHolidaysPage
   /**
    *   Displays the contact page.
    *
    *   @param includeFestivalHolidays a <code>boolean</code> to indicate 
    *                                  whether festival holidays should be 
    *                                  displayed
    *   @param includeFederalHolidays  a <code>boolean</code> to indicate 
    *                                  whether federal holidays should be 
    *                                  displayed
    *   @param usingTheModel           the {@link Model} to use to display the 
    *                                  holidays
    */
   // --------------------------------------------------------------------------
   @GetMapping(value = "/holidays")
   protected final 
   String
   displayTheHolidaysPage
     (@RequestParam(name="festival", required=false) boolean includeFestivalHolidays, 
      @RequestParam(name="federal",  required=false) boolean includeFederalHolidays, 
      final                                          Model   usingTheModel)
   { // begin displaying the holidays page
      List<Holiday>  theHolidays;
      Holiday.Type[] theTypes;
      //
      usingTheModel.addAttribute("festival", includeFestivalHolidays);
      usingTheModel.addAttribute("federal",  includeFederalHolidays);
      //
      theHolidays = Arrays.asList(
         new Holiday(" Jan 1 ",  "New Year's Day",             Holiday.Type.FESTIVAL),
         new Holiday(" Oct 31 ", "Halloween",                  Holiday.Type.FESTIVAL),
         new Holiday(" Nov 24 ", "Thanksgiving Day",           Holiday.Type.FESTIVAL),
         new Holiday(" Dec 25 ", "Christmas",                  Holiday.Type.FESTIVAL),
         new Holiday(" Jan 17 ", "Martin Luther King Jr. Day", Holiday.Type.FEDERAL),
         new Holiday(" July 4 ", "Independence Day",           Holiday.Type.FEDERAL),
         new Holiday(" Sep 5 ",  "Labor Day",                  Holiday.Type.FEDERAL),
         new Holiday(" Nov 11 ", "Veterans Day",               Holiday.Type.FEDERAL)
      );
      //
      theTypes = Holiday.Type.values();
      for (Holiday.Type thisType : theTypes)
      { // begin for each holiday type
         usingTheModel.addAttribute(thisType.toString(), 
                                    (theHolidays
                                     .stream()
                                     .filter(thisHoliday -> thisHoliday
                                                            .getType()
                                                            .equals(thisType))
                                     .collect(Collectors.toList())));
      } // end for each holiday type
      //
      return ("holidays.html");
   } // end displaying the holidays page
} // end controlling holidays