package service;

import Entity.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ExpenseRepository;

import java.util.List;
@Service
public class ExpenseServiceImpl implements ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepo;
    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepo.findAll();
    }
}
