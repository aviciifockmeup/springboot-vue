import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'


const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },

// DosAttack
  {
    path:'/DDos',
    name:'DDos',
    component:()=>import("@/views/DosAttack/DDos.vue")
},
{
  path:'/GoldenEye',
      name:'GoldenEye',
    component:()=>import("@/views/DosAttack/GoldenEye.vue")
},
{
  path:'/Hulk',
      name:'Hulk',
    component:()=>import("@/views/DosAttack/Hulk.vue")
},
{
  path:'/slowhttptest',
      name:'slowhttptest.vue',
    component:()=>import("@/views/DosAttack/slowhttptest.vue")
},
{
  path:'/slowloris',
      name:'slowloris.vue',
    component:()=>import("@/views/DosAttack/slowloris.vue")
},


//BruteForce

{
  path:'/Hydra',
      name:'Hydra',
    component:()=>import("@/views/BruteForce/Hydra")
},
{
  path:'/Patator',
      name:'Patator',
    component:()=>import("@/views/BruteForce/Patator")
},

//ScanPort
{
  path:'/hping3',
      name:'hping3',
    component:()=>import("@/views/ScanPort/hping3")
},
{
  path:'/nmap',
      name:'nmap',
    component:()=>import("@/views/ScanPort/nmap")
},
//WebAttack
{
  path:'/BF',
      name:'BF',
    component:()=>import("@/views/WebAttack/BF")
},
{
  path:'/SQLinjection',
      name:'SQLinjection',
    component:()=>import("@/views/WebAttack/SQLinjection")
},


]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
