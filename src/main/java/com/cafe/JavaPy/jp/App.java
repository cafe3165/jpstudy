package com.cafe.JavaPy.jp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.python.core.PyFunction;
import org.python.core.PyInteger;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!");
//        PythonInterpreter interpreter = new PythonInterpreter();
//        interpreter.exec("a=[5,2,3,9,4,0]; ");
//        interpreter.exec("print(sorted(a));");  //此处python语句是3.x版本的语法
//        interpreter.exec("print sorted(a);");   //此处是python语句是2.x版本的语法
//
//        @SuppressWarnings("resource")
//		PythonInterpreter interpreter = new PythonInterpreter();
//		interpreter.execfile("add.py");
////				
//		// 第一个参数为期望获得的函数（变量）的名字，第二个参数为期望返回的对象类型
//		PyFunction pyFunction = interpreter.get("add", PyFunction.class);
//		int a = 5, b = 10;
//		//调用函数，如果函数需要参数，在Java中必须先将参数转化为对应的“Python类型”
//		PyObject pyobj = pyFunction.__call__(new PyInteger(a), new PyInteger(b)); 
//		System.out.println("the anwser is: " + pyobj);

		@SuppressWarnings("resource")
		PythonInterpreter interpreter = new PythonInterpreter();
		interpreter.execfile("C:\\Users\\more\\Desktop\\code\\read_comd.py");

		//		try {
//			System.out.println("start");
//			Process pr = Runtime.getRuntime().exec("C:\\Users\\more\\Desktop\\code\\read_comd.py");
//
////			BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
////			String line;
////			while ((line = in.readLine()) != null) {
////				System.out.println(line);
////			}
////			in.close();
////			pr.waitFor();
////			System.out.println("end");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		 interpreter.exec("import stanfordcorenlp"); 
//		 interpreter.exec("print stanfordcorenlp.path");

	}
}
