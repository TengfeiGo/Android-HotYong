package com.example.factory.databse;

import com.example.factory.databse.factory.DataCacheHandlerFactory;
import com.example.factory.databse.operator.DiskLruCacheOperator;

/**
 * @author tengfei
 */
public class Client {

    public static void main(String[] args) {
        DiskLruCacheOperator diskLruCacheOperator = (DiskLruCacheOperator) DataCacheHandlerFactory.newInstance().createDataCache(DiskLruCacheOperator.class);
        diskLruCacheOperator.put("key","value");
        diskLruCacheOperator.get("key");
    }
}