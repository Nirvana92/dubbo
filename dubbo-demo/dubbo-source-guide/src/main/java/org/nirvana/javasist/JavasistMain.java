package org.nirvana.javasist;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;

import java.io.IOException;

/**
 * @author gzm
 * @date 2020/7/19 12:36 下午
 */
public class JavasistMain {
    public static void main(String[] args) throws NotFoundException, CannotCompileException, IOException {
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.get("org.nirvana.javasist.Rectangle");
        CtMethod method = new CtMethod(ctClass, "helloJavasist", null, null);
        ctClass.addMethod(method);
        // ctClass.setSuperclass(pool.get("org.nirvana.javasist.Point"));
        ctClass.writeFile();
    }
}
