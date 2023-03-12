package Polymorphism.E04Calculator;

import java.util.Deque;

public class MsOperation implements Operation{

    private Deque<Integer> memory;


    public MsOperation(Deque<Integer> memory){
        this.memory = memory;
    }

    @Override
    public void addOperand(int operand) {
        this.memory.push(operand);
    }

    @Override
    public boolean isCompleted() {
        return false;
    }

    @Override
    public int getResult() {
        return memory.peek();
    }
}
