package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class SalaryAdapterTestSuite {

    @Test
    public void testTotalSalary() {

        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();

        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(), workers.getSalaries());

        System.out.println(totalSalary);
        assertEquals(totalSalary,27750,0);
    }
}
