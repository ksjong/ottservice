
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import SubscribeSubscribeManager from "./components/listers/SubscribeSubscribeCards"
import SubscribeSubscribeDetail from "./components/listers/SubscribeSubscribeDetail"

import ServiceServiceManagementManager from "./components/listers/ServiceServiceManagementCards"
import ServiceServiceManagementDetail from "./components/listers/ServiceServiceManagementDetail"

import SubscriberManageSubscriberManagementManager from "./components/listers/SubscriberManageSubscriberManagementCards"
import SubscriberManageSubscriberManagementDetail from "./components/listers/SubscriberManageSubscriberManagementDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/subscribes/subscribes',
                name: 'SubscribeSubscribeManager',
                component: SubscribeSubscribeManager
            },
            {
                path: '/subscribes/subscribes/:id',
                name: 'SubscribeSubscribeDetail',
                component: SubscribeSubscribeDetail
            },

            {
                path: '/services/serviceManagements',
                name: 'ServiceServiceManagementManager',
                component: ServiceServiceManagementManager
            },
            {
                path: '/services/serviceManagements/:id',
                name: 'ServiceServiceManagementDetail',
                component: ServiceServiceManagementDetail
            },

            {
                path: '/subscriberManages/subscriberManagements',
                name: 'SubscriberManageSubscriberManagementManager',
                component: SubscriberManageSubscriberManagementManager
            },
            {
                path: '/subscriberManages/subscriberManagements/:id',
                name: 'SubscriberManageSubscriberManagementDetail',
                component: SubscriberManageSubscriberManagementDetail
            },




    ]
})
