package org.example.addressbook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CabInvoiceTest {

    CabInvoice ci = new CabInvoice();

    @Test
    void totalFareJourney() {

    Assertions.assertEquals(25,ci.totalFareJourney(2,5));

    }
}