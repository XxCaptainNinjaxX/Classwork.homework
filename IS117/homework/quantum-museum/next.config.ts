import type { NextConfig } from "next";

const nextConfig: NextConfig = {
    output: "export",
    basePath: "/quantum-museum",
    images: {
        unoptimized: true,
    },
};

export default nextConfig;
