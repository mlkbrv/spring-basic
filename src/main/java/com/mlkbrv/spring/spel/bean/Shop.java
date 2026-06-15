package com.mlkbrv.spring.spel.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Shop {

    @Value("#{productList.getProducts()}")
    private List<ProductList.Product> productList;

    @Value("#{productList.getProducts().?[getFit()]}")
    private List<ProductList.Product> suitableProductList;

    @Value("#{productList.getProducts().?[getCount()<10]}")
    private List<ProductList.Product> endingProductList;

    @Value("#{T(java.time.LocalTime).of(9,0)}")
    private LocalTime openTime;

    public void printOpenTime(){
        System.out.println(openTime);
    }

    public void printAllProducts(){
        System.out.println(productList);
    }

    public void printSuitableProducts(){
        System.out.println(suitableProductList);
    }

    public void printEndingProducts(){
        System.out.println(endingProductList);
    }

    public void simpleEvaluateContextExample(){
        simpleReadOnlyContext();
        System.out.println("--------------------");
        simpleReadWriteContext();
    }

    private void simpleReadOnlyContext(){
        SpelExpressionParser parser = new SpelExpressionParser();

        ExpressionParserObject expressionParserObject = new ExpressionParserObject();

        EvaluationContext evaluationContext = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        Expression firstStrValueExpression = parser.parseExpression("strings[0]");

        String firstFromList = firstStrValueExpression.getValue(evaluationContext, expressionParserObject).toString();

        System.out.println(firstFromList);

        Expression secondFromMap = parser.parseExpression("map[2]");
        String valueFromMap = secondFromMap.getValue(evaluationContext, expressionParserObject).toString();
        System.out.println(valueFromMap);
    }

    private void simpleReadWriteContext(){
        SpelExpressionParser parser = new SpelExpressionParser();

        ExpressionParserObject expressionParserObject = new ExpressionParserObject();

        EvaluationContext evaluationContext = SimpleEvaluationContext.forReadWriteDataBinding().build();

        Expression getListExp = parser.parseExpression("strings");
        List<String> list = (List<String>) getListExp.getValue(evaluationContext, expressionParserObject);

        list.add("four");

        System.out.println(expressionParserObject.getStrings());

        Expression changeFirstValueExp = parser.parseExpression("map[1]");
        changeFirstValueExp.setValue(evaluationContext, expressionParserObject, "four");

        System.out.println(expressionParserObject.getMap());
    }

    private static class ExpressionParserObject{
        private List<String> strings = new ArrayList<>(List.of("one","two","three"));
        private Map<Integer,String> map = new HashMap<>(Map.of(1,"one",2,"two",3,"three"));

        public Map<Integer, String> getMap() {
            return map;
        }

        public List<String> getStrings() {
            return strings;
        }
    }

}
