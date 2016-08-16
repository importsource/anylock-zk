package com.importsource.anylock.zk;
import java.util.List;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.ZooKeeper;

public class ZkConnector {

	private ZooKeeper zk = null;

	public void init(String address, String serverName) throws Exception {
		zk = new ZooKeeper(address, 50000, new MultiWatcher(serverName));
	}

	public void close() throws Exception {
		if (zk != null) {
			zk.close();
		}
	}

	public List<String> getChilds(String path) throws KeeperException, InterruptedException {
		if (zk != null) {
			return zk.getChildren(path, true);
		}
		return null;
	}

	public String getData(String path) throws KeeperException, InterruptedException {
		if (zk != null) {
			byte[] b = zk.getData(path, true, null);
			return new String(b);
		}
		return null;
	}

	public void changeData(String path, String data) throws KeeperException, InterruptedException {
		if (zk != null) {
			zk.setData(path, data.getBytes(), -1);
		}
	}

	public void delData(String path) throws InterruptedException, KeeperException {
		if (zk != null) {
			zk.delete(path, -1);
		}
	}

	public boolean exist(String path) throws KeeperException, InterruptedException {
		if (zk != null) {
			return zk.exists(path, true) != null;
		}
		return false;
	}

	public void apendTempNode(String path, String data) throws KeeperException, InterruptedException {
		// TODO Auto-generated method stub
		if (zk != null) {
			zk.create(path, data.getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
		}
	}

	public static void main(String[] args) throws Exception {
		ZkConnector zkConnector = new ZkConnector();
		zkConnector.init("localhost:2181", "husf");
		List<String> childs = zkConnector.getChilds("/");
		System.out.println(childs);
		System.out.println(zkConnector.getData("/zk_test"));
		zkConnector.exist("/zt");
		Thread.sleep(1000000);
	}

}
