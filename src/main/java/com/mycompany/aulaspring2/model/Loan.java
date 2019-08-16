/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aulaspring2.model;

import java.time.LocalDateTime;

/**
 *
 * @author Bianca
 */
public class Loan {
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String cpfCustomer;
//    private Customer customer;
//    private Product product;

    //keyshortcut: alt+insert to generate getters and setters
    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getCpfCustomer() {
        return cpfCustomer;
    }

    public void setCpfCustomer(String cpfCustomer) {
        this.cpfCustomer = cpfCustomer;
    }
}
