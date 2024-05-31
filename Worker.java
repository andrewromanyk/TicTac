//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lection2.tictak;

public class Worker extends Thread {
	private int id;
	private Data data;

	public Worker(int id, Data d) {
		this.id = id;
		this.data = d;
		this.start();
	}

	public void run() {
		super.run();

		for(int i = 0; i < 5; ++i) {
			synchronized(this.data) {
				int state = this.data.getState();
				if (state == 1) {
					this.data.Tic();
				} else if (state == 2) {
					this.data.Tak();
				} else {
					this.data.Toy();
				}
			}
		}

	}
}
