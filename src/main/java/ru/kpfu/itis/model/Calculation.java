package ru.kpfu.itis.model;

/**
 * Created by Apraxin Vladimir on 9.5.17.
 */
public class Calculation {

    private Double intermediateValue;

    private Double newValue;

    private Operation operation;

    public Calculation() {
    }

    public Calculation(double intermediateValue, double newValue, Operation operation) {
        this.intermediateValue = intermediateValue;
        this.newValue = newValue;
        this.operation = operation;
    }

    public Double getIntermediateValue() {
        return intermediateValue;
    }

    public void setIntermediateValue(double intermediateValue) {
        this.intermediateValue = intermediateValue;
    }

    public Double getNewValue() {
        return newValue;
    }

    public void setNewValue(double newValue) {
        this.newValue = newValue;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
