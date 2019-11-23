package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    private Job jobA = new Job();
    private Job jobB = new Job();

    @Test
    public void testSettingJobId() {
          assertEquals(jobA.getId() + 1, jobB.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(jobA.getName(), "Product tester");
        assertEquals(jobA.getEmployer().getValue(), "ACME");
        assertEquals(jobA.getLocation().getValue(),  "Desert");
        assertEquals(jobA.getPositionType().getValue(), "Quality control");
        assertEquals(jobA.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        jobB = new Job(jobA.getName(), jobA.getEmployer(), jobA.getLocation(), jobA.getPositionType(), jobA.getCoreCompetency());
        assertNotEquals(jobA, jobB);
    }
}
