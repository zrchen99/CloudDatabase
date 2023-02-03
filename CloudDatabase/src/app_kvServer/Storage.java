package app_kvServer;

import shared.messages.KVMessage;
import shared.messages.KVMessage.StatusType;
import org.apache.log4j.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.StringBuffer;
import java.io.FileOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import org.json.simple.JSONObject;

public class Storage {
    
    // if we are storing key:value pairs, the easiest way to implement something like this would be using JSON(which is basically an dict/hashtable in text form)
    // https://www.tutorialspoint.com/how-to-write-create-a-json-file-using-java



    public StatusType put(String key, String value) throws Exception {
        // TODO: create put method to append/add/modify key value pair into file
        return StatusType.PUT_ERROR;
    };
    
    public String get(String key) throws Exception {
        // TODO: create get method to search key in file
        return "";
    }
}
