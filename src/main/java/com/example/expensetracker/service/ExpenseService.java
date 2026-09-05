package com.example.expensetracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.expensetracker.entity.Expense;
import com.example.expensetracker.exception.ResourceNotFoundException;
import com.example.expensetracker.repository.ExpenseRepository;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public void deleteExpense(Long id) {

        if (!expenseRepository.existsById(id)) {
            throw new ResourceNotFoundException(
                    "Expense not found with id: " + id);
        }

        expenseRepository.deleteById(id);
    }
    
    public Expense updateExpense(Long id, Expense expense) {

        Expense existingExpense = expenseRepository.findById(id)
                .orElseThrow(() ->
                    new ResourceNotFoundException("Expense not found with id: " + id));

        existingExpense.setDescription(expense.getDescription());
        existingExpense.setAmount(expense.getAmount());
        existingExpense.setCategory(expense.getCategory());
        existingExpense.setDate(expense.getDate());

        return expenseRepository.save(existingExpense);
    }
}