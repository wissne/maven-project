package com.maple.study.pattern.singleton.prototype;

import java.io.*;

/**
 * Created by aurogon-mac on 15/7/18.
 */
public class DeepCloneUtil {

    public static Object clone(Object target) throws IOException, ClassNotFoundException {
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(target);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
