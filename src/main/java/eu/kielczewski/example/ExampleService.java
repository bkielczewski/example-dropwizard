package eu.kielczewski.example;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import eu.kielczewski.example.config.ExampleServiceConfiguration;
import eu.kielczewski.example.resource.HelloResource;

public class ExampleService extends Service<ExampleServiceConfiguration> {

    public static void main(String[] args) throws Exception {
        new ExampleService().run(args);
    }

    @Override
    public void initialize(final Bootstrap<ExampleServiceConfiguration> bootstrap) {
        bootstrap.setName("dropwizard-example");
    }

    @Override
    public void run(final ExampleServiceConfiguration conf, final Environment env) throws Exception {
        env.addResource(new HelloResource(conf.getMessages()));
    }

}
