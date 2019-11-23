package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    private Job jobA;
    private Job jobB;

    @Before
    public void before() {
        jobA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobB = new Job(jobA.getName(), jobA.getEmployer(), jobA.getLocation(), jobA.getPositionType(), jobA.getCoreCompetency());
    }

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
        assertNotEquals(jobA, jobB);
    }

    @Test
    public void toStringWorks() {
        //check to make sure first character is a newline:
        assertFalse(String.valueOf(jobA.toString().charAt(0)).matches("."));
        //check to make sure last TWO characters are newlines:
        assertFalse(String.valueOf(jobA.toString().charAt(jobA.toString().length() - 1)).matches(".") || String.valueOf(jobA.toString().charAt(jobA.toString().length() - 2)).matches("."));
        //check for proper response when all values are filled:
        assertEquals(jobA.toString(), "\nID: " + jobA.getId() + "\nName: " + jobA.getName() + "\nEmployer: " + jobA.getEmployer() + "\nLocation: " + jobA.getLocation() + "\nPosition Type: " + jobA.getPositionType() + "\nCore Competency: " + jobA.getCoreCompetency() + "\n\n");
        //set one field to be blank:
        jobA.setName("");
        //check for proper response to blank field:
        assertEquals(jobA.toString(), "\nID: " + jobA.getId() + "\nName: Data not available\nEmployer: " + jobA.getEmployer() + "\nLocation: " + jobA.getLocation() + "\nPosition Type: " + jobA.getPositionType() + "\nCore Competency: " + jobA.getCoreCompetency() + "\n\n");
        //create empty Job
        jobA = new Job();
        //check for proper response to all fields being empty except ID:
        assertEquals(jobA.toString(), "\nID: " + jobA.getId() + "\nOOPS! This job does not seem to exist.\n\n");
    }
}
