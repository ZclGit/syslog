package com.example.syslog.comfig;


import org.graylog2.syslog4j.Syslog;
import org.graylog2.syslog4j.SyslogIF;
import org.graylog2.syslog4j.impl.net.udp.UDPNetSyslogConfig;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;

public class SyslogTest {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("time：" + new Date().toString().substring(4, 20) + ";");
        buffer.append("userID:" + "uuu1" + ";");
        buffer.append("logType:" + "100"+ ";");
        buffer.append("actiom:" + "delete" + ";");
        buffer.append("des:" + "312312323");
        buffer.append("哈哈哈"+"啦啦啦");



        UDPNetSyslogConfig udpNetSyslogConfig = new UDPNetSyslogConfig();
        udpNetSyslogConfig.setHost("192.168.0.101");
        udpNetSyslogConfig.setPort(514);
        Syslog.shutdown();
        SyslogIF udp = Syslog.createInstance("udp",udpNetSyslogConfig);
        try {
            udp.log(1,URLDecoder.decode(buffer.toString(),"utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
