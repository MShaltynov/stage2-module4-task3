package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser {
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        char[] charArray = string.toCharArray();
        for (char element : charArray) {
            abstractTextComponent.add(new SymbolLeaf(element, TextComponentType.WORD));
        }
    }

    // Write your code here!

}
