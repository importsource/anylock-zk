package com.importsource.anylock.zk;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

public class MultiWatcher implements Watcher {



    public MultiWatcher(String serverName) {
		// TODO Auto-generated constructor stub
	}

	public void process(WatchedEvent event) {

	// TODO Auto-generated method stub

	String outputStr = "";

	outputStr += ",path:" + event.getPath();

	outputStr += ",state:" + event.getState();

	outputStr += ",type:" + event.getType();

	outputStr += ",wrapper:" + event.getWrapper();



	System.out.println(outputStr);

    }

}

