<template>
  <div style="padding: 10px" >

<el-row>
  <el-col :span="12">

  <el-form-item>
  <header style="color:red; font-family:'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif; font-size:large;">GoldenEye</header>
  </el-form-item>
  </el-col>
</el-row>




<el-row>
  <el-col :span="12">
    <el-form-item label="线程数">
    <el-input v-model="formData.Threads" placeholder="default 0" />
  </el-form-item>
  </el-col>
</el-row>




<el-row>
<el-col :span="12">
  <el-form-item label="连接数">
    <el-input v-model="formData.Connections" placeholder="default 0" />
  </el-form-item>

</el-col>
</el-row>


<el-row>
<el-col :span="12">
  <el-form-item label="攻击的端口号">
    <el-input v-model="formData.Port" placeholder="default 80" />
  </el-form-item>

</el-col>

</el-row>



<el-row>

<el-col :span="12">

<el-form-item label="http方法">
  <el-select v-model="httpWays" class="m-2" placeholder="default get" @change="selectWays" size="large">
    <el-option
      v-for="item in ways"
      :key="item.value"
      :label="item.label"
      :value="item.value"

    />
  </el-select>

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



<el-button @click="GoldenEye()" type="primary">Attack</el-button>
<el-button @click="Load()" type="primary">End</el-button>

  </div>
</template>

<script>

import request from "../../utils/request";
export default {
  name: 'GoldenEye',
  components: {
    
  },

  


  data(){
    return{

      formData:{

        Threads:'',
        Connections:'',
        Port:'',
        IP:'',
        Way:'',

      },
        httpWays:'',
        ways:[{
              value: "选项1",
              label:'get'
        },
            {
              value: "选项2",
              label:'post'
            }],


    }
  },

  methods:{
    GoldenEye() {
      request.post("/GoldenEye",this.formData).then(res => {
        console.log(res)
        console.log(this.formData)
      })
    },

    selectWays(val){

      let checkLabel = this.ways.find( item => item.value ==val).label
      console.log(checkLabel)
      this.formData.Way = checkLabel


    },

    },



}
</script>
