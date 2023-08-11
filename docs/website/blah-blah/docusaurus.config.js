module.exports = {
  title: 'Blah-Blah',
  tagline: 'BlahBlah Documentation',
   url: 'https://github.com',
   baseUrl: '/blahblah/',

   organizationName: 'getspherelabs', // Usually your GitHub org/user name.
   projectName: 'blahblah', // Usually your repo name.
   deploymentBranch: 'gh-pages',
   onBrokenLinks: 'throw',
   onBrokenMarkdownLinks: 'warn',
   themeConfig: {
    navbar: {
      title: 'Blah-Blah (Kotlin Multiplatform)',
      items: [
        {
          href: 'https://getspherelabs.github.io/blahblah/',
          label: 'Home',
          position: 'right',
        },
        {
          href: 'https://getspherelabs.github.io/blahblah/',
          label: 'GitHub',
          position: 'right',
          className: 'github',
        },
      ],
    },
    footer: {
      style: 'light',
      links: [
      ],
      copyright: `Copyright © ${new Date().getFullYear()} Meteor Multiplatform`,
    },
    colorMode: {
      respectPrefersColorScheme: false,
      defaultMode: 'light',
      disableSwitch: true,
    },
    prism: {
      theme: require('./themes/meteor'),
      additionalLanguages: ["swift", "kotlin","groovy"],
    },
  },
  presets: [
    [
      '@docusaurus/preset-classic',
      {
        docs: {
          sidebarPath: require.resolve('./sidebars.js'),
          routeBasePath: '/',
        },
        theme: {
          customCss: require.resolve('./src/css/custom.css'),
        },
        sitemap: {
          changefreq: 'weekly',
          priority: 0.5,
        },
      },
    ],
  ],
  markdown: {
      mermaid: true,
  },
  themes: ['@docusaurus/theme-mermaid'],
//  plugins: [
//    [
//      '@docusaurus/plugin-client-redirects',
//      {
//        redirects: [
//          // {
//          // },
//        ],
//      }
//    ],
//  ]
};
