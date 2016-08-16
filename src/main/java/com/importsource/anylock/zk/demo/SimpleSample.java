package com.importsource.anylock.zk.demo;

import com.importsource.anylock.zk.DistributedLock;

public class SimpleSample {

	public static void main(String[] args) {
		DistributedLock lock = null;
		try {
			lock = new DistributedLock("127.0.0.1:2182", "test");
			lock.lock();
			// do something...
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (lock != null)
			lock.unlock();
		}
	}

}
