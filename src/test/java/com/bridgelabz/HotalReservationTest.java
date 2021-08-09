package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author mandeep
 * HotalReservationTest matcher form hotelReservation class
 */
public class HotalReservationTest {
    HotalReservation hotelReservation = new HotalReservation();

    /**
     * test for true
     */
    @Test
    public void givenName_FirstLetterUpperCase_ShouldReturnTrue () {
        boolean result = hotelReservation.validateName("Lakewood");
        Assert.assertTrue(result);
    }

    /**
     * test for false
     */
    @Test
    public void givenName_WhenLessThanThreeChar_ShouldReturnFalse () {
        boolean result = hotelReservation.validateName("La");
        Assert.assertFalse(result);
    }
}
