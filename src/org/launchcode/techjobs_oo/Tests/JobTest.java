package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job jobA = new Job();
    Job jobB = new Job();

    @Test
    public void testSettingJobId() {
          assertEquals(jobA.getId() + 1, jobB.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(jobA.getName(), "Product tester");
        assertTrue(jobA.getEmployer() instanceof Employer);
        assertTrue(jobA.getLocation() instanceof  Location);
        assertTrue(jobA.getPositionType() instanceof PositionType);
        assertTrue(jobA.getCoreCompetency() instanceof  CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        jobB = new Job(jobA.getName(), jobA.getEmployer(), jobA.getLocation(), jobA.getPositionType(), jobA.getCoreCompetency());
        assertNotEquals(jobA, jobB);
    }
}
