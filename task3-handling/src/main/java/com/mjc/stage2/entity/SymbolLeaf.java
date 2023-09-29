package com.mjc.stage2.entity;

public class SymbolLeaf extends  AbstractTextComponent{

    private char value;

    public SymbolLeaf(char value, TextComponentType componentType) {
        super(componentType);
        this.value=value;
    }

    @Override
    public String operation() {
        return String.valueOf(value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
throw new RuntimeException();
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        throw new RuntimeException();
    }

    @Override
    public int getSize() {
        throw new RuntimeException();
    }

    // Write your code here!
}
