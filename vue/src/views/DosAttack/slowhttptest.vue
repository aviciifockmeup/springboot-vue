<template>
  <div style="padding: 10px" >

<el-row>
  <el-col :span="12">

  <el-form-item>
  <header style="color:red; font-family:'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif; font-size:large;">slowhttptest</header>
  </el-form-item>
  </el-col>
</el-row>




<el-row>
  <el-col :span="12">
    <el-form-item label="连接速率">
    <el-input v-model="formData.velocity" placeholder="Please input" />
  </el-form-item>
  </el-col>
</el-row>




<el-row>
<el-col :span="12">
  <el-form-item label="发起的连接数">
    <el-input v-model="formData.Connections" placeholder="Please input" />
  </el-form-item>

</el-col>
</el-row>

<el-row>
<el-col :span="12">
  <el-form-item label="持续时间">
    <el-input v-model="formData.duration" placeholder="Please input" />
  </el-form-item>

</el-col>
</el-row>
<el-row>
<el-col :span="12">
  <el-form-item label="模式">
    <el-input v-model="formData.mode" placeholder="Please input" />
  </el-form-item>

</el-col>
</el-row>
    <el-row>
      <el-col :span="12">
        <el-form-item label="IP">
          <el-input v-model="formData.IP" placeholder="Please input" />
        </el-form-item>

      </el-col>
    </el-row>






<el-button @click="slowhttptest" type="primary">Attack</el-button>
<el-button type="primary">End</el-button>

  </div>
</template>

<script>
import request from "../../utils/request";
export default {
  name: 'GoldenEye',
  components: {},


  data() {
    return {

      formData: {
        velocity: '',
        Connections: '',
        duration: '',
        mode: '',
        IP: '',
      },


      httpWays: '',
      ways: [{
        id: 1,
        name: 'get'
      },
        {
          id: 2,
          name: 'post'
        }]

    }
  },

  methods: {
    slowhttptest() {
      request.post("/slowhttptest", this.formData).then(res => {
        console.log(res)
        console.log(this.formData)
      })
    },


  }

}
</script>
