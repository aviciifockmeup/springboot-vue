<template>
    <div style="padding: 10px" >

        <el-row>
            <el-col :span="12">

                <el-form-item>
                    <header style="color:red; font-family:'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif; font-size:large;">Hydra</header>
                </el-form-item>
            </el-col>
        </el-row>


        <el-row>

            <el-col :span="12">

                <el-form-item label="暴力破解的服务">
                    <el-select v-model="httpService" class="m-2" placeholder="暴力破解的服务" @change="selectService" size="large">
                        <el-option
                                v-for="item in services"
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
                <el-form-item label="用户名">
                    <el-input v-model="formData.username" placeholder="Please input" />
                </el-form-item>
            </el-col>
        </el-row>




        <el-row>
            <el-col :span="12">
                <el-form-item label="密码文件路径">
                    <el-input v-model="formData.password" placeholder="Please input" />
                </el-form-item>

            </el-col>
        </el-row>

        <el-row>
            <el-col :span="12">
                <el-form-item label="线程数">
                    <el-input v-model="formData.Threads" placeholder="Please input" />
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

                    username:'',
                    password:'',
                    Threads:'',
                    IP:'',
                    service:'',

                },
                httpService:'',
                services:[{
                    value: "选项1",
                    label:'ftp'
                },
                    {
                        value: "选项2",
                        label:'ssh'
                    },
                    {
                        value: "选项3",
                        label:'telnet'
                    },
                    {
                        value: "选项4",
                        label:'smtp'
                    }],


            }
        },

        methods:{
            GoldenEye() {
                request.post("/Hydra",this.formData).then(res => {
                    console.log(res)
                    console.log(this.formData)
                })
            },

            selectService(val){

                // let checkLabel = this.services.find( item => item.value ==val).label
                // console.log(checkLabel)
                // this.formData.service = checkLabel


                var titleGet = sessionStorage.getItem('temp')
                console.log(titleGet)

                this.formData.IP = titleGet

            },

        },



    }
</script>
