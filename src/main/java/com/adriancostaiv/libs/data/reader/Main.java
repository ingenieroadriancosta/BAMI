package com.adriancostaiv.libs.data.reader;

import com.adriancostaiv.libs.data.logger.ILogger;
import com.adriancostaiv.libs.data.writer.Writer;

public class Main {
    static final ILogger logger = ILogger.getLogger();
    public static void main(String[] args)  {
        try {
            Writer.writeString("target/baloto.csv", BalReader.getAllDatas());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
