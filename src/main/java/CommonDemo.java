import java.util.List;

import org.apache.zookeeper.KeeperException;

/**
 * 
 */

/**
 * @author Hezf
 *
 */
public class CommonDemo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws KeeperException 
	 */
	public static void main(String[] args) throws KeeperException, InterruptedException {
		ZkConnector zkConnector = new ZkConnector();
		try {
			zkConnector.init("localhost:2181", "husf");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> childs = zkConnector.getChilds("/locks");
		/*for (int i = 0; i < 100000; i++) {
			System.out.println(childs);
		}*/
		System.out.println(childs);
		

	}

}
