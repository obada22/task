/*package com.task.transactions.service;

import com.task.transactions.entity.Purchase;
import com.task.transactions.repository.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDate;
import java.util.List;

public class scheduledReports {

    @Autowired
    private PurchaseRepo purchaseRepos; // Assuming you have a PurchaseRepository


    @Scheduled(cron = "0 0 1 * * *") // Run at 1:00 AM every day
    public void sendDailyReport() {
        // Calculate yesterday's date
        LocalDate yesterday = LocalDate.now().minusDays(1);

        // Fetch purchases made yesterday from the database
        List<Purchase> purchases = purchaseRepos.findB(yesterday);

        // Generate report based on the purchases (e.g., using a reporting library)

        // Send report as an email attachment
        sendEmailWithAttachment(purchases);
    }
}
        */