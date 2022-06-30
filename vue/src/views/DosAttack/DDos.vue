<template>
  <div style="padding: 10px" >

<el-row>
  <el-col :span="12">

  <el-form-item>
  <header style="color:red; font-family:'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif; font-size:large;">DDos</header>
  </el-form-item>
  </el-col>
</el-row>




<el-row>
  <el-col :span="12">
    <el-form-item label="开始攻击的端口">
    <el-input v-model="formData.Port" placeholder="Please input" />
  </el-form-item>
  </el-col>
</el-row>




<el-row>
<el-col :span="12">
  <el-form-item label="目标IP">
    <el-input v-model="formData.IP" placeholder="Please input" />
  </el-form-item>

</el-col>
</el-row>






    <el-button @click="DDos()" type="primary">Attack</el-button>
<el-button type="primary">End</el-button>

  </div>
</template>





<!---->

<script>


import request from "../../utils/request";

export default {
  name: 'GoldenEye',
  components: {
    
  },

  


  data(){
    return{

      formData:{
        Port:'',
        IP:'',
      },

      httpWays:'',
      ways:[{
          id: 1,
          name:'Get'
      },
      {
         id: 2,
        name:'Post' 
      }]

    }
  },

  methods:{
    DDos() {
      request.post("/DDos",this.formData).then(res => {
        console.log(res)
        console.log(this.formData)
      })
    },



    },



}
</script>
