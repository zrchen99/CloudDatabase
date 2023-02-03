package app_kvServer;

import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

import logger.LogSetup;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class KVServer implements IKVServer {
	/**
	 * Start KV Server at given port
	 * @param port given port for storage server to operate
	 * @param cacheSize specifies how many key-value pairs the server is allowed
	 *           to keep in-memory
	 * @param strategy specifies the cache replacement strategy in case the cache
	 *           is full and there is a GET- or PUT-request on a key that is
	 *           currently not contained in the cache. Options are "FIFO", "LRU",
	 *           and "LFU".
	 */

	private static Logger logger = Logger.getRootLogger();
	
	private int port;
	private int cacheSize;
    private ServerSocket serverSocket;
	private Socket client;
    private boolean running;
	private String strategy;

	public KVServer(int port, int cacheSize, String strategy) {
		// Instantiates the server
		this.port = port;
		this.cacheSize = cacheSize;
		this.strategy = strategy;

	}
	
	@Override
	public int getPort(){
		// TODO Auto-generated method stub
		return this.port;
	}

	@Override
    public String getHostname(){
		// TODO Auto-generated method stub
		return serverSocket.getInetAddress().getHostName();
	}

	@Override
    public CacheStrategy getCacheStrategy(){
		// TODO Auto-generated method stub
		switch(this.strategy){
			case "LRU" :
				return IKVServer.CacheStrategy.LRU;
			case "LFU" :
				return IKVServer.CacheStrategy.LFU;
			case "FIFO" :
				return IKVServer.CacheStrategy.FIFO;
			default:
				return IKVServer.CacheStrategy.None;
		}
	}

	@Override
    public int getCacheSize(){
		// TODO Auto-generated method stub
		return this.cacheSize;
	}

	@Override
    public boolean inStorage(String key){
		// TODO Auto-generated method stub
		return false;
	}

	@Override
    public boolean inCache(String key){
		// TODO Auto-generated method stub
		return false;
	}

	@Override
    public String getKV(String key) throws Exception{
		// TODO Auto-generated method stub
		return "";
	}

	@Override
    public void putKV(String key, String value) throws Exception{
		// TODO Auto-generated method stub
	}

	@Override
    public void clearCache(){
		// TODO Auto-generated method stub
	}

	@Override
    public void clearStorage(){
		// TODO Auto-generated method stub
	}

	@Override
    public void run(){
		// TODO Auto-generated method stub
	}

	@Override
    public void kill(){
		// TODO Auto-generated method stub
	}

	@Override
    public void close(){
		// TODO Auto-generated method stub
	}
}
