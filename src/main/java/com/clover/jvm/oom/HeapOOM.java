package com.clover.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * java堆内存溢出测试 
 * VM args : -Xms20M -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * 
 * @author UncleClover
 * @Email qiang900714@126.com
 * @time 2018年11月6日 上午10:14:35
 */
public class HeapOOM {
	static class ObjectOOM {
	}

	public static void main(String[] args) {
		List<ObjectOOM> objectOOMs = new ArrayList<>();
		while (true) {
			objectOOMs.add(new ObjectOOM());
		}
	}
}
