<template>
  <div style="padding: 10px" >

<el-row>
  <el-col :span="12">

  <el-form-item>
  <header style="color:red; font-family:'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif; font-size:large;">slowloris</header>
  </el-form-item>
  </el-col>
</el-row>




<el-row>
  <el-col :span="12">
    <el-form-item label="端口号">
    <el-input v-model="formData.Port" placeholder="default 80" />
  </el-form-item>
  </el-col>
</el-row>




<el-row>
<el-col :span="12">
  <el-form-item label="使用的套接字数">
    <el-input v-model="formData.Socket" placeholder="default 150" />
  </el-form-item>

</el-col>
</el-row>

<el-row>
<el-col :span="12">
  <el-form-item label="睡眠时间">
    <el-input v-model="formData.sleeptime" placeholder="default 15" />
  </el-form-item>

</el-col>
</el-row>
<el-row>
<el-col :span="12">
  <el-form-item label="IP">
    <el-input v-model="formData.IP" placeholder="default 192.168.252.1" />
  </el-form-item>

</el-col>
</el-row>






<el-button @click="slowloris()" type="primary">Attack</el-button>
<el-button type="primary">End</el-button>

  </div>
</template>

<script>
import axios from 'axios'
import request from "../../utils/request";
export default {
  name: 'GoldenEye',
  components: {},


  data() {
    return {

      formData: {
        Port: '',
        Socket: '',
        sleeptime: '',
        IP: '',
      },

      httpWays: '',
      ways: [{
        id: 1,
        name: 'Get'
      },
        {
          id: 2,
          name: 'Post'
        }]

    }
  },

  methods: {
    slowloris() {
      request.post("/slowloris", this.formData).then(res => {
        console.log(res)
        console.log(this.formData)
      })
    },


  }
}
</script>
