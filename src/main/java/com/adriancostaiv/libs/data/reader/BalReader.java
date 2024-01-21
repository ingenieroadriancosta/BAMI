package com.adriancostaiv.libs.data.reader;

import com.adriancostaiv.libs.data.constant.url.AllUrl;
import com.adriancostaiv.libs.data.dto.BalDTO;
import com.adriancostaiv.libs.data.logger.ILogger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class BalReader {
    static final ILogger logger = ILogger.getLogger();

    public static BalDTO getDataFromUrl(String url) {
        BalDTO bdto = new BalDTO();
        try {
            String allLines = Reader.readURLToString(url);
            final int INIT = allLines.indexOf(AllUrl.BALINIT);
            final int END = allLines.indexOf(AllUrl.BALEND);
            allLines = allLines.substring(INIT,END);
            BufferedReader buffR = new BufferedReader(new StringReader(allLines));
            String line;
            boolean convertBall=false;
            while ( (line=buffR.readLine())!=null ){
                if(convertBall){
                    bdto.addBal( Integer.parseInt(line.replaceAll(" ","")) + "" );
                    convertBall = false;
                }else if(line.contains(AllUrl.LINEYELLOW) || line.contains(AllUrl.LINERED)){
                    convertBall = true;
                }
            }
        } catch (IOException e) {
            logger.info("\nTOP EN:"+url+"\n");
        }
        return bdto;
    }

    public static String getAllDatas(String url) throws IOException {
        String output = "";
        BalDTO bdto;
        for(int i=AllUrl.BALI;i>-1;i++){
            String urlC = url+i;
            logger.info("Reading - " + urlC );
            bdto = getDataFromUrl(urlC);
            if(bdto.isEmpty()){
                break;
            }
            output = output + bdto.toString();
        }
        return output;
    }

    public static String getAllDatasBal() throws IOException {
        return getAllDatas(AllUrl.BAL);
    }

    public static String getAllDatasRev() throws IOException {
        return getAllDatas(AllUrl.REV);
    }

}
