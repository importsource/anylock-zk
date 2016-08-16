package com.importsource.anylock.zk.demo;

import com.importsource.anylock.zk.ZKLock;

public class SimpleSample {

	public static void main(String[] args) {
		ZKLock lock = null;
		try {
			lock = new ZKLock("127.0.0.1:2182", "test");
			lock.lock();
			// do something...
		} catch (Exception e) {
			//TODO
		} finally {
			if (lock != null)
			lock.unlock();
		}
	}

}
