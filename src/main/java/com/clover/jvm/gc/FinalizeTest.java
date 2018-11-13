package com.clover.jvm.gc;

public class FinalizeTest {
	public static FinalizeTest SAVE_HOOK = null;

	private void isAlive() {
		System.out.println("我还活着，放心！");
	}

	@Override
	public void finalize() throws Throwable {
		super.finalize();
		System.err.println("finalize方法被调用");
		FinalizeTest.SAVE_HOOK = this;
	}

	public static void main(String[] args) throws InterruptedException {
		SAVE_HOOK = new FinalizeTest();
		
		SAVE_HOOK = null;
		System.gc();

		// finalize执行优先级很低，需要休息一会儿:)
		Thread.sleep(500);
		if(SAVE_HOOK != null) {
			SAVE_HOOK.isAlive();
		}else {
			System.out.println("哟~我已经死了~请不要怀念我~");
		}
		
		SAVE_HOOK = null;
		System.gc();

		// finalize执行优先级很低，需要休息一会儿:)
		Thread.sleep(500);
		if(SAVE_HOOK != null) {
			SAVE_HOOK.isAlive();
		}else {
			System.out.println("哟~我已经死了~请不要怀念我~");
		}
	}
}
