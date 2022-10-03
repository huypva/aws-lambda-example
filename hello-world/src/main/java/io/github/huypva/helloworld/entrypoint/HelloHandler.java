package io.github.huypva.helloworld.entrypoint;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * @author huypva
 */
public class HelloHandler implements RequestHandler<String, Object> {

  @Override
  public Object handleRequest(String s, Context context) {
    context.getLogger().log("Input: " + s);
    return "Lambda Function is invoked...." + s;
  }
}
