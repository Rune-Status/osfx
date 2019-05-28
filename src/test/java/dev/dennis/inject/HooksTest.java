package dev.dennis.inject;

import com.google.gson.Gson;
import dev.dennis.mixin.hook.Hooks;

import java.io.InputStreamReader;

public class HooksTest {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Hooks hooks = gson.fromJson(new InputStreamReader(HooksTest.class.getResourceAsStream("/hooks/180.json")),
                Hooks.class);
        System.out.println(hooks);

    }
}
